package grace.demos

class Note {

    String body

    static belongsTo = [contact: Contact]

    static constraints = {
    }
}
