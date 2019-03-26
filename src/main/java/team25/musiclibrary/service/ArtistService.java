package team25.musiclibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team25.musiclibrary.dao.ArtistDAO;
import team25.musiclibrary.entities.Artist;

import java.util.List;

@Service("artistService")
public class ArtistService {

    @Autowired
    ArtistDAO artistDAO;

    @Transactional
    public List getAll(){
        return (List) artistDAO.findAll();
    }
    @Transactional
    public Artist getArtist(int id){
        return artistDAO.findById(id).get();
    }
    @Transactional
    public void addArtist(Artist artist){
        artistDAO.save(artist);
    }
    @Transactional
    public void deleteArtist(int id){
        artistDAO.deleteById(id);
    }
}
