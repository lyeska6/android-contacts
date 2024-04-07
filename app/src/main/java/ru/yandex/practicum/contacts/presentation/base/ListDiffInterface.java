package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {

    boolean theSameAs(T smth);

    boolean equals(Object smth);
}
