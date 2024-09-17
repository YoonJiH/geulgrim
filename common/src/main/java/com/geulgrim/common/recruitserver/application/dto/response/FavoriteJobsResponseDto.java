package com.geulgrim.common.recruitserver.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FavoriteJobsResponseDto {

    List<JobResponseDto> responses;
}
