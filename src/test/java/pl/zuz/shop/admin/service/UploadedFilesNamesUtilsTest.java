package pl.zuz.shop.admin.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UploadedFilesNamesUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "test test.png, test-test.png",
            "hello word.png, hello-word.png ",
            "aęśćżźńłó.png, aesczznlo.png",
            "Produkt 1.png, produkt-1.png",
            "Produkt - 1.png, produkt-1.png",
            "Produkt  1.png, produkt-1.png",
            "Produkt__1.png, produkt-1.png"

    })
    void shouldSlugifyFileName(String in, String out){
        String fileName = UploadedFilesNamesUtils.slugifyFileName(in);
        assertEquals(fileName,out);

    }
}