// Autogenerated by convert_tests.py and process_polyglot.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../templates/Test.java
package com.rethinkdb.gen;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.gen.exc.*;
import com.rethinkdb.gen.ast.*;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.model.MapObject;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.net.Connection;
import com.rethinkdb.net.Cursor;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.Instant;
import java.util.stream.LongStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import java.util.Collections;
import java.nio.charset.StandardCharsets;

import static com.rethinkdb.TestingCommon.*;
import com.rethinkdb.TestingFramework;

public class MetaDbs {
    // Tests meta queries for databases
    Logger logger = LoggerFactory.getLogger(MetaDbs.class);
    public static final RethinkDB r = RethinkDB.r;

    Connection conn;

    @Before
    public void setUp() throws Exception {
        logger.info("Setting up.");
        conn = TestingFramework.createConnection();
        try {
            r.dbCreate("test").run(conn);
            r.db("test").wait_().run(conn);
        }catch (Exception e){}
    }

    @After
    public void tearDown() throws Exception {
        logger.info("Tearing down.");
        r.db("rethinkdb").table("_debug_scratch").delete().run(conn);
        if(!conn.isOpen()){
            conn.close();
            conn = TestingFramework.createConnection();
        }
        r.dbDrop("test").run(conn);
        conn.close(false);
    }

    // Autogenerated tests below

    @Test(timeout=120000)
    public void test() throws Exception {

        {
            // meta/dbs.yaml line #6
            /* bag(['rethinkdb', 'test']) */
            Bag expected_ = bag(r.array("rethinkdb", "test"));
            /* r.db_list() */
            logger.info("About to run line #6: r.dbList()");
            Object obtained = runOrCatch(r.dbList(),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #6");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #6:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // meta/dbs.yaml line #11
            /* partial({'dbs_created':1}) */
            Partial expected_ = partial(r.hashMap("dbs_created", 1L));
            /* r.db_create('a') */
            logger.info("About to run line #11: r.dbCreate('a')");
            Object obtained = runOrCatch(r.dbCreate("a"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #11");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #11:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // meta/dbs.yaml line #13
            /* partial({'dbs_created':1}) */
            Partial expected_ = partial(r.hashMap("dbs_created", 1L));
            /* r.db_create('b') */
            logger.info("About to run line #13: r.dbCreate('b')");
            Object obtained = runOrCatch(r.dbCreate("b"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #13");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #13:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // meta/dbs.yaml line #18
            /* bag(['rethinkdb', 'a', 'b', 'test']) */
            Bag expected_ = bag(r.array("rethinkdb", "a", "b", "test"));
            /* r.db_list() */
            logger.info("About to run line #18: r.dbList()");
            Object obtained = runOrCatch(r.dbList(),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #18");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #18:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // meta/dbs.yaml line #23
            /* {'name':'a','id':uuid()} */
            Map expected_ = r.hashMap("name", "a").with("id", uuid());
            /* r.db('a').config() */
            logger.info("About to run line #23: r.db('a').config()");
            Object obtained = runOrCatch(r.db("a").config(),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #23");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #23:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // meta/dbs.yaml line #28
            /* partial({'dbs_dropped':1}) */
            Partial expected_ = partial(r.hashMap("dbs_dropped", 1L));
            /* r.db_drop('b') */
            logger.info("About to run line #28: r.dbDrop('b')");
            Object obtained = runOrCatch(r.dbDrop("b"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #28");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #28:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // meta/dbs.yaml line #31
            /* bag(['rethinkdb', 'a', 'test']) */
            Bag expected_ = bag(r.array("rethinkdb", "a", "test"));
            /* r.db_list() */
            logger.info("About to run line #31: r.dbList()");
            Object obtained = runOrCatch(r.dbList(),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #31");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #31:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // meta/dbs.yaml line #34
            /* partial({'dbs_dropped':1}) */
            Partial expected_ = partial(r.hashMap("dbs_dropped", 1L));
            /* r.db_drop('a') */
            logger.info("About to run line #34: r.dbDrop('a')");
            Object obtained = runOrCatch(r.dbDrop("a"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #34");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #34:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // meta/dbs.yaml line #37
            /* bag(['rethinkdb', 'test']) */
            Bag expected_ = bag(r.array("rethinkdb", "test"));
            /* r.db_list() */
            logger.info("About to run line #37: r.dbList()");
            Object obtained = runOrCatch(r.dbList(),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #37");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #37:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // meta/dbs.yaml line #41
            /* partial({'dbs_created':1}) */
            Partial expected_ = partial(r.hashMap("dbs_created", 1L));
            /* r.db_create('bar') */
            logger.info("About to run line #41: r.dbCreate('bar')");
            Object obtained = runOrCatch(r.dbCreate("bar"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #41");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #41:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // meta/dbs.yaml line #44
            /* err('ReqlOpFailedError', 'Database `bar` already exists.', [0]) */
            Err expected_ = err("ReqlOpFailedError", "Database `bar` already exists.", r.array(0L));
            /* r.db_create('bar') */
            logger.info("About to run line #44: r.dbCreate('bar')");
            Object obtained = runOrCatch(r.dbCreate("bar"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #44");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #44:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // meta/dbs.yaml line #47
            /* partial({'dbs_dropped':1}) */
            Partial expected_ = partial(r.hashMap("dbs_dropped", 1L));
            /* r.db_drop('bar') */
            logger.info("About to run line #47: r.dbDrop('bar')");
            Object obtained = runOrCatch(r.dbDrop("bar"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #47");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #47:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // meta/dbs.yaml line #50
            /* err('ReqlOpFailedError', 'Database `bar` does not exist.', [0]) */
            Err expected_ = err("ReqlOpFailedError", "Database `bar` does not exist.", r.array(0L));
            /* r.db_drop('bar') */
            logger.info("About to run line #50: r.dbDrop('bar')");
            Object obtained = runOrCatch(r.dbDrop("bar"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #50");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #50:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
    }
}
