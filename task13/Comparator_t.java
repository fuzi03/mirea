package task13_punkt;

public interface Comparator_t {
    public static void quickSort(Student[] students, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = students[(leftMarker + rightMarker) / 2].getAge();
        do {

            while (students[leftMarker].getAge() > pivot) {
                leftMarker++;
            }

            while (students[rightMarker].getAge() < pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {

                if (leftMarker < rightMarker) {
                    Student tmp = students[leftMarker];
                    students[leftMarker] = students[rightMarker];
                    students[rightMarker] = tmp;
                }

                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(students, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(students, leftBorder, rightMarker);
        }
    }

}
