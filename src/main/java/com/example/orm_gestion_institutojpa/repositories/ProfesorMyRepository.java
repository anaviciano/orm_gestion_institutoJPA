package com.example.orm_gestion_institutojpa.repositories;
//
import com.example.orm_gestion_institutojpa.entities.Modulo;
import com.example.orm_gestion_institutojpa.entities.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.query.FluentQuery;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//
//
public interface ProfesorMyRepository extends JpaRepository<Profesor, Long> {

}
//
//    //@Autowired
//    private MyRepository repositorio;
//
//    @Override
//    public <S extends Profesor> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Profesor> List<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<Profesor> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public List<Profesor> findAll() {
//
//        return (List<Profesor>) repositorio.findAll();
//    }
//
//    @Override
//    public List<Profesor> findAllById(Iterable<Long> longs) {
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
//
//    }
//
//    @Override
//    public void delete(Profesor entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Profesor> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public Optional<Profesor> findOneById(int id){
//        return Optional.of((Profesor) repositorio.findById(id).orElse(null));
//    }
//
///*
//    @Override
//    public Direccion updateById(Direccion direccion){
//        return (Direccion) repositorio.save(direccion);
//    }
//
// */
//
//    @Override
//    public Profesor updateById(int id){
//        return (Profesor) repositorio.updateById(id);
//    }
//
//
//    @Override
//    public void deleteById(int id) {
//
//        repositorio.deleteById(id);
//    }
//
//    @Override
//    public void flush() {
//
//    }
//
//    @Override
//    public <S extends Profesor> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Profesor> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<Profesor> entities) {
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
//    public Profesor getOne(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public Profesor getById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public Profesor getReferenceById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public <S extends Profesor> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends Profesor> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends Profesor> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends Profesor> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Profesor> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends Profesor> boolean exists(Example<S> example) {
//        return false;
//    }
//
//    @Override
//    public <S extends Profesor, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return null;
//    }
//
//    @Override
//    public List<Profesor> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<Profesor> findAll(Pageable pageable) {
//        return null;
//    }
//}
