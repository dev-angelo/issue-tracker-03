package com.codesquad.issue.domain.issue.response;

import com.codesquad.issue.domain.issue.Issue;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class IssueResponse {

    private final List<Issue> issues;

    public IssueResponse(List<Issue> issues) {
        this.issues = issues;
    }
}
