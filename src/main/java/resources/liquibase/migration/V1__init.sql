CREATE TABLE api_logs (
                          id BIGSERIAL PRIMARY KEY,
                          request_body TEXT,
                          response_body TEXT,
                          created_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE days (
                      id BIGSERIAL PRIMARY KEY,
                      date DATE NOT NULL UNIQUE,
                      day_type VARCHAR(255) NOT NULL
);