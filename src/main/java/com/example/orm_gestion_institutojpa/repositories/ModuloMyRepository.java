package com.example.orm_gestion_institutojpa.repositories;
//
import com.example.orm_gestion_institutojpa.entities.Alumno;
import com.example.orm_gestion_institutojpa.entities.Modulo;
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
public interface ModuloMyRepository extends JpaRepository<Modulo, Long> {

}
//
//    //@Autowired
//    private MyRepository repositorio;
//
//    @Override
//    public <S extends Modulo> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Modulo> List<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<Modulo> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public List<Modulo> findAll() {
//
//        return (List<Modulo>) repositorio.findAll();
//    }
//
//    @Override
//    public List<Modulo> findAllById(Iterable<Long> longs) {
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
//    public void delete(Modulo entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Modulo> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
//    @Override
//    public Optional<Modulo> findOneById(int id){
//        return Optional.of((Modulo) repositorio.findById(id).orElse(null));
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
//    public Modulo updateById(int id){
//        return (Modulo) repositorio.updateById(id);
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
//    public <S extends Modulo> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Modulo> List<S> saveAllAndFlush(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public void deleteAllInBatch(Iterable<Modulo> entities) {
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
//    public Modulo getOne(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public Modulo getById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public Modulo getReferenceById(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public <S extends Modulo> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    @Override
//    public <S extends Modulo> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    @Override
//    public <S extends Modulo> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    @Override
//    public <S extends Modulo> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Modulo> long count(Example<S> example) {
//        return 0;
//    }
//
//    @Override
//    public <S extends Modulo> boolean exists(Example<S> example) {
//        return false;
//    }
//
//    @Override
//    public <S extends Modulo, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//        return null;
//    }
//
//    @Override
//    public List<Modulo> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<Modulo> findAll(Pageable pageable) {
//        return null;
//    }
//}
