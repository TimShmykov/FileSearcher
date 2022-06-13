package ru.timshmykov.filesearcher;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.timshmykov.filesearcher.model.FilesData;
import ru.timshmykov.filesearcher.search.service.FilesDataService;
import ru.timshmykov.filesearcher.search.service.storage.FilesDataStorage;

import java.io.File;
import java.util.List;

@RequiredArgsConstructor
@SpringBootApplication
public class SearcherRunner implements CommandLineRunner {

    private final FilesDataService filesDataService;
    private final FilesDataStorage filesDataStorage;


    public static void main(String[] args) {
        SpringApplication.run(SearcherRunner.class, args);
    }

    @Override
    public void run(String... args) throws InterruptedException {

        List<FilesData> filesData = filesDataService.searchFile(new File("C://Test"), null);
        filesDataStorage.saveData(filesData);
    }

}