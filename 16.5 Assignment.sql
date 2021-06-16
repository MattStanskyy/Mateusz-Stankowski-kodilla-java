INSERT INTO POSTS (USER_ID, BODY)
VALUES (1, 'Testing post added 1');

INSERT INTO POSTS (USER_ID, BODY)
VALUES (2, 'Testing post added 2');

INSERT INTO POSTS (USER_ID, BODY)
VALUES (3, 'Testing post added 3');

COMMIT;

UPDATE POSTS
SET BODY = 'To delete'
WHERE BODY = 'Testing post added 1';

UPDATE POSTS
SET BODY = 'To delete'
WHERE BODY = 'Testing post added 2';

UPDATE POSTS
SET BODY = 'To delete'
WHERE BODY = 'Testing post added 3';

COMMIT;

DELETE FROM POSTS
WHERE BODY = 'To delete';

COMMIT;