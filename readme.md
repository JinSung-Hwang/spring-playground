# Spring Playground

## Description

스프링 기술을 활용하여 자유롭게 테스트 해보는 공간입니다.

## Setting

### Lombok 세팅

intellij build를 사용하려면 annotation processing를 활성화 시켜야 한다.

1. preference 열기
2. plugins 선택
3. market 탭 선택
4. lombok 설치
4. Apply 선택
5. OK 선택
1. 다시 preference 열기
2. annotation processors 검색
3. enable annotation processing 체크
4. Apply 선택
5. OK 선택

### Build 세팅
이것을 해야 build가 빨라지고 test에서 intellij에 testName이 표시된다.

1. preference
1. gradle 검색
1. build and running using: intellij idea 선택
1. run tests using: intellij idea 선택
1. OK 선택

### Encoding 세팅
1. preference 열기
2. file encodings 선택
    1. global encodings: utf-8 선택
    1. project encodings: utf-8 선택
    1. default encodings for properties files: utf-8 선택
    1. transparent native-to-ascii conversion 체크박스 체크표시
3. apply 클릭
4. ok 클릭

### Live Template 세팅
Edit창에 ttd 입력으로 템플릿 뜰 수 있도록 만들기

1. preference 열기
1. live template 검색
1. add 버튼 클릭
1. group template 선택
1. "custom" 입력
1. OK 클릭
1. add 버튼 클릭
1. live template 선택
1. "ttd" 입력
1. 아래 내용 입력
```java
@org.junit.jupiter.api.DisplayName("$displayName$")
@org.junit.jupiter.api.Test
void $methodName$() {
  // Given
  $end$
  // When

  // Then
}

```
11. 하단 부분에 change 클릭(어떤 확장자에서 live templates이 표시될것인지 설정해야함)
12. java 클릭
13. OK 버튼 클릭
