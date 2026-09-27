package grace.demos

class Contact {

    String firstName
    String lastName
    String email

    static hasMany = [notes: Note]

    static constraints = {
    }

    static mappping = {
        notes cascade: 'all-delete-orphan'
    }
}
