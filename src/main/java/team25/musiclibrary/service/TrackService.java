package team25.musiclibrary.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team25.musiclibrary.dao.TrackDAO;
import team25.musiclibrary.entities.Track;

@Service("trackService")
public class TrackService {

    @Autowired
    TrackDAO trackDAO;

    @Transactional
    public List getAll() {
        return (List) trackDAO.findAll();
    }

    @Transactional
    public Track getTrack(int id) {
        return trackDAO.findById(id).get();
    }

    @Transactional
    public void addTrack(Track track) {
        trackDAO.save(track);
    }

    @Transactional
    public void updateTrack(Track track) {
        trackDAO.save(track);
    }

    @Transactional
    public void deleteTrack(int id) {
        trackDAO.deleteById(id);
    }

}
