package com.android.example.wordlistsqlwithcontentprovider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class Contract {

    public static final String DATABASE_NAME = "wordlist";
    public static final String KEY_ID = "_id";
    public static final String KEY_WORD = "word";


    public static final int ALL_ITEMS = -2;
    public static final String COUNT = "count";

    public static final String AUTHORITY =
           "com.android.example.wordlistsqlwithcontentprovider.provider";
    public static final String CONTENT_PATH = "words";
    public static final Uri CONTENT_URI =
           Uri.parse("content://" + AUTHORITY + "/" + CONTENT_PATH);
    public static final Uri ROW_COUNT_URI =
           Uri.parse("content://" + AUTHORITY + "/" + CONTENT_PATH + "/" + COUNT);

    static final String SINGLE_RECORD_MIME_TYPE =
       "vnd.android.cursor.item/vnd.com.example.provider.words";
    static final String MULTIPLE_RECORDS_MIME_TYPE =
       "vnd.android.cursor.item/vnd.com.example.provider.words";

    


    private Contract(){}

    public static abstract class WordList implements BaseColumns {
    }
}
