CREATE TABLE IF NOT EXISTS MERCHANT (
    id UUID PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(255),
    latitude DECIMAL(8,6) NOT NULL,
    longitude DECIMAL(9,6) NOT NULL,
);

CREATE TABLE IF NOT EXISTS ORDER (
    id UUID PRIMARY KEY,
    merchant_id UUID,
    price DECIMAL(10, 2),
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    latitude DECIMAL(8,6) NOT NULL,
    longitude DECIMAL(9,6) NOT NULL,
);

CREATE TABLE IF NOT EXISTS DISCOUNT(
    discount_id UUID PRIMARY KEY,
    price DECIMAL(10, 2),
    begin_time TIMESTAMP,
    end_time TIMESTAMP,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    is_valid BOOLEAN,
);

CREATE TABLE IF NOT EXISTS SURGE (
    surge_id UUID PRIMARY KEY,
    price DECIMAL(10, 2),
    begin_time TIMESTAMP,
    end_time TIMESTAMP,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    is_valid BOOLEAN,
);

CREATE TABLE IF NOT EXISTS QUOTATION_REJECTED(
    rejection_id UUID PRIMARY KEY,
    reason VARCHAR(255),
    merchant_id UUID REFERENCES MERCHANT(id),
    created_at TIMESTAMP
);

CREATE TABLE IF NOT EXISTS QUOTATION (
    id UUID PRIMARY KEY,
    order_id UUID REFERENCES ORDER(id),
    merchant_id UUID REFERENCES MERCHANT(id),
    price_base DECIMAL(10, 2),
    price_surge DECIMAL(10, 2),
    price_discount DECIMAL(10,2),
    distance DECIMAL(4, 2),
    created_at TIMESTAMP
);

