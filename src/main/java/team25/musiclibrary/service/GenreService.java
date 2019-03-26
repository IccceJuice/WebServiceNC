package team25.musiclibrary.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team25.musiclibrary.dao.GenreDAO;
import team25.musiclibrary.entities.Genre;

import java.util.List;

@Service("genreService")
public class GenreService {

    @Autowired
    GenreDAO genreDAO;

    @Transactional
    public List getAll(){
        return (List) genreDAO.findAll();
    }
    @Transactional
    public Genre getGenre(int id){
        return genreDAO.findById(id).get();
    }
    @Transactional
    public void addGenre(Genre genre){
        genreDAO.save(genre);
    }
    @Transactional
    public void deleteGenre(int id){
        genreDAO.deleteById(id);
    }
}
