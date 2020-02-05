package com.socialmediaraiser.twitter.dto.tweet;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TweetSearchV2DTO {
    private List<TweetDTOv2> data;
    private Meta meta;

    @Getter
    @Setter
    public static class Meta{
        @JsonProperty("newest_id")
        private String newestId;
        @JsonProperty("oldest_id")
        private String oldestId;
        @JsonProperty("next_token")
        private String nextToken;
        @JsonProperty("result_count")
        private int resultCount;
    }
}
