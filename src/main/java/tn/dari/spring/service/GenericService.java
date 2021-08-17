package tn.dari.spring.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface GenericService<E, D, M> {
    D save(E entity);

    List<D> save(List<E> entities);

    void deleteById(M id);

    Optional<D> findById(M id);

    List<D> findAll();

    Page<D> findAll(Pageable pageable);

    D update(E entity, M id);
}
