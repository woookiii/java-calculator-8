# java-calculator-precourse
***
## 기능목록
***

### 초기 인풋을 받는 메소드
    -param: void
    -return: String

### 커스텀 구분자가 있는지 확인하는 메소드
    - 첫번째, 두번째, 네번째, 다섯번째 문자가 순서대로 /, /, \, n 인지 체크
    - param: String
    - return: boolean

### 커스텀 구분자가 있으면, 커스텀 구분자를 추출할 메소드
    - 커스텀 구분자가 . | * + ? ^ $ ( ) [ ] { } \ 중에 하나라면 \\을 붙여서 리턴
    - param: String
    - return: String

### 커스텀 구분자가 있으면, 커스텀 구분자 폼을 전체 인풋 문자열에서 제거해서 합연산을 할 문자열만 남길 메소드
    - param: String
    - return: String

### 합연산할 문자열에 0부터 9까지의 숫자와 정해진 구분자 이외의 문자가 있는지 검증하는 메소드
    - params: String extractedStringFromInput(합연산할 문자열), String delimiterRegex(구분자를 담고있는 대괄호 문자열)
    - return: void

### 합연산할 문자열을 구분자로 쪼개서 문자열 배열을 리턴하는 메소드
    - params: String extractedStringFromInput(합연산할 문자열), String delimiterRegex(구분자를 담고있는 대괄호 문자열)
    - return: String[]

### 문자열 배열에서 숫자를 파싱해서 합연산을 수행하는 메소드
    - param: String
    - return: Long

### 주어진 숫자를 결과 폼으로 만들어 주는 메소드
    - param: Long
    - param: String

