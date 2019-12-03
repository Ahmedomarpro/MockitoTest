# MockitoTest
* [Mockito](http://junit.sourceforge.net/javadoc/org/junit/Assert.html)
* [Test Android - Build local unit tests](https://developer.android.com/training/testing/unit-testing/local-unit-tests)

<img src="https://miro.medium.com/max/800/1*gEBdwJRxgGWUhZb8REN8uw.png"></a>

## android gradle dependencies
```

//Mockito
  dedicated --->  testCompile 'junit:junit:4.12'
  
    testImplementation 'org.mockito:mockito-core:1.10.19'


testOptions {
        unitTests.all {
            // All the usual Gradle options.
            jvmArgs '-XX:MaxPermSize=256m'
            unitTests.includeAndroidResources = true

        }
    }
    
```


## Test Code 

```
 // 1
@RunWith(MockitoJUnitRunner.class)
```

```
// 2
public static final String TEST_STRING = "HELLO WORLD!";

	@Mock
	Context mMockContext;

```

```
	public void readStringFromContext() {

		//Returns the TEST_STRING when getString
		when(mMockContext.getString(R.string.app_name)).thenReturn(TEST_STRING);

		//Creates an object of the ClassUnderTest with the mock context
		MainActivity mainActivityTest = new MainActivity(mMockContext);

		//Stores the return value of getHelloWorldString() in result
		String result = mainActivityTest.getHelloWorldString();

		//Asserts that result is the value of TEST_STRIN
		assertThat(result, is(TEST_STRING));

	}

```

```
@Test
	public void testMockMethod() {

		List mockList = Mockito.mock(ArrayList.class);


		mockList.add("hello world");

		Mockito.verify(mockList).add("hello world");

		assertEquals(0, mockList.size());

	}
```
