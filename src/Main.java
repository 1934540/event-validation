public class Main {
    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 16),
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 0, 16),
        };
    }


    public static void validEvent(Event event) {
        if (event.getTitle().equals(null) || event.getRealiseYear()==0 || event.getAge()==0) {
            throw new RuntimeException("Заполните все поля");
        }
        if (event.getAge() < 16) {
            throw new RuntimeException("Не подходит по возрасту");
        }

        else System.out.println("Все ок");
    }



    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validEvent(event);
        }
        for (Event event : getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }


}
