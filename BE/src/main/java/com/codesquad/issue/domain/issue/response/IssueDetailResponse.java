package com.codesquad.issue.domain.issue.response;

import com.codesquad.issue.domain.account.response.AccountResponse;
import com.codesquad.issue.domain.comment.response.CommentResponse;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class IssueDetailResponse {

    private final Long id;

    private final String title;

    private final Boolean isOpen;

    private final LocalDateTime createdTimeAt;

    private final AccountResponse author;

    private final List<CommentResponse> comments;

    @Builder
    private IssueDetailResponse(Long id, String title, Boolean isOpen, LocalDateTime createdTimeAt,
            AccountResponse author, List<CommentResponse> comments) {
        this.id = id;
        this.title = title;
        this.isOpen = isOpen;
        this.createdTimeAt = createdTimeAt;
        this.author = author;
        this.comments = comments;
    }
}
