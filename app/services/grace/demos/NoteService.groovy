package grace.demos

import grails.gorm.services.Service

@Service(Note)
interface NoteService {

    Note get(Serializable id)

    List<Note> list(Map args)

    Long count()

    void delete(Serializable id)

    Note save(Note note)

}