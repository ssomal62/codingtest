SELECT a.AUTHOR_ID, AUTHOR_NAME, CATEGORY, sum(sales*PRICE) AS TOTAL_SALES
FROM BOOK_SALES s
JOIN BOOK b ON s.BOOK_ID = b.BOOK_ID
JOIN AUTHOR a ON b.AUTHOR_ID = a.AUTHOR_ID
WHERE YEAR(SALES_DATE) = 2022 AND MONTH(SALES_DATE) = 1
GROUP BY a.AUTHOR_ID, CATEGORY
ORDER BY 1 ASC, 3 DESC;

-- DATE_FORMAT(SALES_DATE,'%m') AS sDATE

