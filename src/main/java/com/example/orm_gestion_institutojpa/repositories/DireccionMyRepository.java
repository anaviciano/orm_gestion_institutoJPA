package com.example.orm_gestion_institutojpa.repositories;
//
import com.example.orm_gestion_institutojpa.entities.Alumno;
import com.example.orm_gestion_institutojpa.entities.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.query.FluentQuery;
///*
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//
public interface DireccionMyRepository extends JpaRepository<Direccion, Long> {

}
//
//    //@Autowired
//    private MyRepository repositorio;
//
//    @Override
//    public <S extends Direccion> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Direccion> List<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<Direccion> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public List<Direccion> findAll() {
//
//        return (List<Direccion>) repositorio.findAll();
//    }
//
//    @Override
//    public List<Direccion> findAllById(Iterable<Long> longs) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(Direccion entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Direccion> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public Optional<Direccion> findOneById(int id){
//        return Optional.of((Direccion) repositorio.findById(id).orElse(null));
//    }
//
//
//
//    @Override
//    public Direccion updateById(int id){
//        return (Direccion) repositorio.updateById(id);
//    }
//
//
//    @Override
//    public void deleteById(int id) {
//
//        repositorio.deleteById(id);
//    }
//
//
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends Direccion> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Direccion> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<Direccion> entities) {
//
//    }
//
//    @Override
//    public void deleteAllByIdInBatch(Iterable<Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAllInBatch() {
//
//    }
//
//    @Override
//    public Direccion getOne(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public Direccion getById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public Direccion getReferenceById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public <S extends Direccion> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends Direccion> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends Direccion> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends Direccion> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Direccion> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends Direccion> boolean exists(Example<S> example) {
//        return false;
//    }
//
//    @Override
//    public <S extends Direccion, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return null;
//    }
//
//    @Override
//    public List<Direccion> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<Direccion> findAll(Pageable pageable) {
//        return null;
//    }
//}
//*/