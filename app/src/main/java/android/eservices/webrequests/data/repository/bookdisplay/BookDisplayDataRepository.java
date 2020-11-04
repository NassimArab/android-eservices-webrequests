package android.eservices.webrequests.data.repository.bookdisplay;

import android.eservices.webrequests.data.api.model.BookSearchResponse;
import android.eservices.webrequests.data.repository.bookdisplay.local.BookDisplayLocalDataSource;
import android.eservices.webrequests.data.repository.bookdisplay.mapper.BookToBookEntityMapper;
import android.eservices.webrequests.data.repository.bookdisplay.remote.BookDisplayRemoteDataSource;

import io.reactivex.Single;

public class BookDisplayDataRepository implements BookDisplayRepository {

    private BookDisplayLocalDataSource bookDisplayLocalDataSource;
    private BookDisplayRemoteDataSource bookDisplayRemoteDataSource;
    private BookToBookEntityMapper bookToBookEntityMapper;
    public BookDisplayDataRepository(BookDisplayLocalDataSource bookDisplayLocalDataSource, BookDisplayRemoteDataSource bookDisplayRemoteDataSource, BookToBookEntityMapper bookToBookEntityMapper) {
        this.bookDisplayLocalDataSource = bookDisplayLocalDataSource;
        this.bookDisplayRemoteDataSource = bookDisplayRemoteDataSource;
        this.bookToBookEntityMapper = bookToBookEntityMapper;
    }

    @Override
    public Single<BookSearchResponse> getBookSearchResponse(String key) {
        return bookDisplayRemoteDataSource.getBookSearchResponse(key);
    }
}
