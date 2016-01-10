package com.atom.ooJo.common.fileup;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.atom.ooJo.common.domain.UpFile;

@Repository
public interface FileUploadDao extends PagingAndSortingRepository<UpFile, Long>, JpaSpecificationExecutor<UpFile> {

	Page<UpFile> findAll(Pageable pageable);

}
