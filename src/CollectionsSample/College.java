package CollectionsSample;

public class College implements Comparable<College> {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    String name;
    int studentCount;

    @Override
    public int compareTo(College o) {
        return Integer.compare(this.getStudentCount(),o.getStudentCount());
    }
}
