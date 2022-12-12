package ru.javawebinar.topjava.service.jdbc;

import org.springframework.test.context.ActiveProfiles;

import org.junit.Ignore;
import ru.javawebinar.topjava.service.AbstractMealServiceTest;

import static ru.javawebinar.topjava.Profiles.JDBC;

@ActiveProfiles(JDBC)
class JdbcMealServiceTest extends AbstractMealServiceTest {
}