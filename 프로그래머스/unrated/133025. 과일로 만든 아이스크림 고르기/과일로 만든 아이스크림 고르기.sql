-- 코드를 입력하세요
SELECT i.FLAVOR FROM ICECREAM_INFO i
JOIN FIRST_HALF f ON f.FLAVOR = i.FLAVOR
WHERE i.INGREDIENT_TYPE = 'fruit_based' and f.TOTAL_ORDER > 3000;