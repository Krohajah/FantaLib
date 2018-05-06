package com.krohajah.fantalib.ui.activity.books;

import com.krohajah.fantalib.data.fantlib.repository.AuthorsRepository;
import com.krohajah.fantalib.mvp.presenter.BasePresenter;
import com.krohajah.logger.Logger;
import com.krohajah.logger.LoggerFactory;
import com.krohajah.utils.rx.RxUtils;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * @author Maxim Berezin
 */
public class BooksPresenter extends BasePresenter<BooksView> implements BooksView {

    private final AuthorsRepository authorsRepository;
    private final Logger logger = LoggerFactory.getLogger(BooksPresenter.class);

    @Inject
    public BooksPresenter(AuthorsRepository authorsRepository) {
        this.authorsRepository = authorsRepository;
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();
        //todo для теста функциональности
        getAuthors();
    }

    private void getAuthors() {
        //todo для теста функциональности.
        CompositeDisposable disposable = new CompositeDisposable();
        disposable.add(authorsRepository.getAuthors()
                .compose(RxUtils.applyUIDefaults())
                .subscribe(response -> {
                    logger.trace(response.message());
                }));
    }
}
