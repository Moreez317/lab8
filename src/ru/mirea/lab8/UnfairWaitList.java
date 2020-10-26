package ru.mirea.lab8;

class UnfairWaitList<E> extends WaitList<E> {

    public UnfairWaitList() {
    }

    void remove(E element) {
        content.remove(element);
    }

    void moveToBack(E element) {
        if (content.remove(element))
        {
            content.add(element);
        }
    }
}