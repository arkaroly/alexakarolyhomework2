public class Section {
    private String semester;
    private String place;
    private String daysAndTimes;
    private Course course;
    private Student[] students;
    private int initialCapacity;

    public Section(Course theCourse, String theSemester, String thePlace, String theDaysAndTimes){
        course = theCourse;
        place = thePlace;
        daysAndTimes = theDaysAndTimes;
        semester = theSemester;
        students = new Student[15];
        initialCapacity = 15;
    }
    public void StudentArrayList(int capacity){
        students = new Student[capacity];
        initialCapicity = capacity;
    }
    public String getPlace(){
        return place;
    }
    public String getDaysAndTimes(){
        return daysAndTimes;
    }
    public String getSemester(){
        return semester;
    }
    public Course getCourse(){
        return course;
    }
    public void setPlace(String newPlace){
        place = newPlace;
    }
    public void setDayAndTimes(String newDaysAndTimes){
        daysAndTimes = newDaysAndTimes;
    }
    public void add(Student student){
        count++;
    }
}


