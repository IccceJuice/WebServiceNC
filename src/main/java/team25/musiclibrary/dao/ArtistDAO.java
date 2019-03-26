package team25.musiclibrary.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import team25.musiclibrary.entities.Artist;

@Repository
public interface ArtistDAO extends CrudRepository<Artist, Integer> {
}
