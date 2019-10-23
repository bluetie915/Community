CREATE TABLE comment
(
    id bigint AUTO_INCREMENT PRIMARY KEY,
    parent_id bigint NOT NULL,
    type int NOT NULL,
    commentator int not null,
    gmt_create bigint not null,
    gmt_modified bigint not null,
    like_count bigint DEFAULT 0
);