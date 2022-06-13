package ru.timshmykov.filesearcher.search.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.timshmykov.filesearcher.model.FilesData;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class FilesDataService {


    public List<FilesData> searchFile(File rootFile, FilesData parent) {
        List<FilesData> fileList = new ArrayList<>();
        FilesData filesData = new FilesData(rootFile.getName(), parent);
        fileList.add(filesData);
        if (rootFile.isDirectory()) {
            File[] dirFiles = rootFile.listFiles();
            if (dirFiles != null) {
                for (File file : dirFiles) {
                    List<FilesData> kids = searchFile(file, filesData);
                    fileList.addAll(kids);

                }
            }
        }

        return fileList;
    }

}




