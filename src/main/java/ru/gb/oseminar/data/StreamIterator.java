package ru.gb.oseminar.data;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private int counter;
    private final List<StudentGroup> studentGroups;

    public StreamIterator(Stream stream) {
        this.studentGroups = stream.getStudentGroups();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentGroups.size();
    }

    @Override
    public StudentGroup next() {
        return studentGroups.get(counter++);
    }
}
