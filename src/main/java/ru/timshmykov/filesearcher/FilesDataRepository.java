package ru.timshmykov.filesearcher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.timshmykov.filesearcher.model.FilesData;

@Repository
public interface FilesDataRepository extends JpaRepository<FilesData, Long> {
}
