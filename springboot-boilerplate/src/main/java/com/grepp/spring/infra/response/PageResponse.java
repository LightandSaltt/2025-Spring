package com.grepp.spring.infra.response;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;

@RequiredArgsConstructor
public class PageResponse<T> {

    private final Page<T> page;
    private final int pageButtonCnt; // 화면에 뿌릴 버튼 개수

    public int currentNumber(){ // adaptor
        return page.getNumber() + 1;
    }

    public int prevPage(){
        return Math.max(currentNumber() - 1, 1);
    }

    public int nextPage(){
        return Math.min(currentNumber() + 1, calcTotalPages());
    }

    public int startNumber(){
        return Math.floorDiv(page.getNumber(), pageButtonCnt) * pageButtonCnt + 1;
    }

    public int endNumber(){
        return Math.min(startNumber() + pageButtonCnt - 1, calcTotalPages());
    }

    public List<T> content() {
        return page.getContent();
    }

    public int calcTotalPages() {
        int totalPages = page.getTotalPages();
        return totalPages == 0 ? totalPages : 1;
    }
}
