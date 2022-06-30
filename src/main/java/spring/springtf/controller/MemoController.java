package spring.springtf.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import spring.springtf.domain.dto.MemoRequestDto;
import spring.springtf.domain.entity.Memo;
import spring.springtf.domain.repository.MemoRepository;
import spring.springtf.service.MemoService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemoController {
    private final MemoService memoService;
    private final MemoRepository memoRepository;

    @GetMapping("/api/memos")
    public List<Memo> getmemos() {
        return memoRepository.findAll();
    }

    @PostMapping("/api/memos")
    public Memo createMemo(@RequestBody MemoRequestDto requestDto) {
        Memo memo = new Memo(requestDto);
        return memoRepository.save(memo);
    }

    @PutMapping("/api/memos/{id}")
    public Long updateMemo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto) {
        return memoService.update(id, requestDto);
    }

    @DeleteMapping("/api/memos/{id}")
    public Long deleteMemo(@PathVariable Long id) {
        memoRepository.deleteById(id);
        return id;
    }
}
