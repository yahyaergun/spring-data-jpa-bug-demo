package com.yahya.springdatabugdemo.repository;

import com.yahya.springdatabugdemo.model.Widget;
import org.springframework.data.repository.Repository;

public interface WidgetRepository extends Repository<Widget, Long> {
    Widget findByZIndex(Integer zIndex);
}
