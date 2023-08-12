package hu.webuni.commonlib.dto;

import java.util.Objects;

public class BaseResponseDto {

    private Object response;

    public BaseResponseDto() {
    }

    public BaseResponseDto(Object response) {
        this.response = response;
    }

    public Object getResponse() {
        return response;
    }

    public BaseResponseDto setResponse(Object response) {
        this.response = response;
        return this;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseResponseDto that = (BaseResponseDto) o;
        return Objects.equals(response, that.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(response);
    }

    @Override
    public String toString() {
        return "BaseResponseDto{" +
                "response=" + response +
                '}';
    }
}
