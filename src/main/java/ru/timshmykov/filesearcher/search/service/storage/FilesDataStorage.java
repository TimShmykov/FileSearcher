package ru.timshmykov.filesearcher.search.service.storage;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.timshmykov.filesearcher.FilesDataRepository;
import ru.timshmykov.filesearcher.model.FilesData;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class FilesDataStorage {

    private final FilesDataRepository filesDataRepository;

    @Transactional
    public void saveData(List<FilesData> filesData) {
        filesDataRepository.saveAll(filesData);

    }
}
