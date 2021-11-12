package assignment4;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadSafeLinkedList {
    private LinkedList<Integer> list = new LinkedList<>();
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    /*
    A ReadWriteLock maintains a pair of associated locks, one for read-only operations and one for writing.
    The read lock may be held simultaneously by multiple reader threads, so long as there are no writers.
    The write lock is exclusive.
    So you can have many readers at a time, but only one writer - and the writer will prevent readers from reading, too.
     */

    public void addAtPosition(int index, int element) {
        lock.writeLock().lock();
        list.add(index, element);
        lock.writeLock().unlock();
    }

    public void removeAtPosition(int element){
        lock.writeLock().lock();
        list.remove(element);
        lock.writeLock().unlock();
    }

    public int getFirst() {
        lock.readLock().lock();
        int first = list.getFirst();
        lock.readLock().unlock();
        return first;
    }

    public int getLast() {
        lock.readLock().lock();
        int last = list.getLast();
        lock.readLock().unlock();
        return last;
    }


    public int size(){
        int size;
        lock.readLock().lock();
        size = list.size();
        lock.readLock().unlock();
        return size;
    }

}
