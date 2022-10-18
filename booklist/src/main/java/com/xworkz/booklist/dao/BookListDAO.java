package com.xworkz.booklist.dao;

import java.util.List;

import com.xworkz.booklist.dto.BookListDTO;

public interface BookListDAO {
Boolean save(BookListDTO dto);
List<BookListDTO> readAll();


}
