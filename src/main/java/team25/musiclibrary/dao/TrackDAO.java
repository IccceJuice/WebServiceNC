package team25.musiclibrary.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import team25.musiclibrary.entities.Track;

@Repository
public class TrackDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    public List<Track> getAllTracks() {
        Session session = sessionFactory.getCurrentSession();
        List<Track> trackList = session.createQuery("from track").list();
        return trackList;
    }

    public Track getTrack(int id) {
        Session session = sessionFactory.getCurrentSession();
        Track track = (Track) session.load(Track.class, new Integer(id));
        return track;
    }

    public Track addTrack(Track track) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(track);
        return track;
    }

    public void updateTrack(Track track) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(track);
    }

    public void deleteTrack(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Track track = (Track) session.load(Track.class, new Integer(id));
        if (null != track) {
            session.delete(track);
        }
    }
}
