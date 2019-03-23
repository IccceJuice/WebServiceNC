package team25.musiclibrary.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import team25.musiclibrary.entities.Track;

@Repository
public interface TrackDAO extends CrudRepository<Track, Integer> {

}
