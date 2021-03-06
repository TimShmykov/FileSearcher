package ru.timshmykov.filesearcher.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "files_data")
@NoArgsConstructor
public class FilesData {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(generator = "files_data_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "files_data_gen", sequenceName = "files_data_id_seq", allocationSize = 1)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private FilesData parent;

    public FilesData(String name, FilesData parent) {
        this.name = name;
        this.parent = parent;
    }
}

