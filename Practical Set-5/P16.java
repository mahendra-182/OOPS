interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No Division";
        }
    }

    public static void main(String[] args) {
        Result r = new Result();
        System.out.println(r.getDivision(65));
    }
}