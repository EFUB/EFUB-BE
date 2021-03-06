//package EFUB.homepage.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.context.WebApplicationContext;
//import org.springframework.web.filter.CharacterEncodingFilter;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Transactional
//@AutoConfigureMockMvc
//@SpringBootTest
//class ApplyControllerTest {
//    @Autowired
//    private ApplyController applyController;
//
//    @Autowired
//    private WebApplicationContext context;
//
//    @Autowired
//    private MockMvc mvc;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @BeforeEach
//    public void setUp(){
//        mvc = MockMvcBuilders.webAppContextSetup(context)
//                .addFilters(new CharacterEncodingFilter("UTF-8", true))
//                .alwaysDo(MockMvcResultHandlers.print())
//                .build();
//    }
//
//    SaveDevelopDto createDevelop(){
//        SaveToolDto tool1 = new SaveToolDto("Java");
//        SaveToolDto tool2 = new SaveToolDto("SpringBoot");
//        List<SaveToolDto> toolList = new ArrayList<>();
//        toolList.add(tool1);
//        toolList.add(tool2);
//
//        SaveInterviewDto interview1 = new SaveInterviewDto("2021-12-02");
//        SaveInterviewDto interview2 = new SaveInterviewDto("2021-12-03");
//        List<SaveInterviewDto> interviewList = new ArrayList<>();
//        interviewList.add(interview1);
//        interviewList.add(interview2);
//
//        SaveDevelopDto newDevelop = SaveDevelopDto.builder()
//                .user_id(Long.valueOf(1000))
//                .motive("???????????? ?????????")
//                .project_topic("???????????? ?????? ?????????")
//                .application_field("???????????????-?????????")
//                .language("Java ?????????")
//                .confidence_lang(4)
//                .tool(toolList)
//                .exp("?????? ?????????")
//                .link("http ?????????")
//                .orientation(true)
//                .interview(interviewList)
//                .build();
//
//        return newDevelop;
//    }
//
//    SaveDesignDto createDesign() {
//        SaveToolDto tool1 = new SaveToolDto("?????????");
//        SaveToolDto tool2 = new SaveToolDto("?????????????????????");
//        List<SaveToolDto> toolList = new ArrayList<>();
//        toolList.add(tool1);
//        toolList.add(tool2);
//
//        SaveDesignDto newDesign = SaveDesignDto.builder()
//                .user_id(Long.valueOf(1001))
//                .motive("????????????")
//                .confidence_des(4)
//                .tool(toolList)
//                .confidence_tool(3)
//                .project_topic("?????? ?????????")
//                .exp_des("???????????? ??????")
//                .exp_dev("????????? ??????")
//                .link("http://")
//                .interview(true)
//                .orientation(true)
//                .build();
//
//        return newDesign;
//    }
//
//    @Test
//    void ?????????_??????() throws Exception {
//        SaveDevelopDto newDevelop = createDevelop();
//
//        mvc.perform(MockMvcRequestBuilders.post("/api/recruitment/apply/save/dev")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(newDevelop)))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//
//    }
//
//    @Test
//    void ????????????_??????() throws Exception {
//        SaveDesignDto newDesign = createDesign();
//
//        mvc.perform(MockMvcRequestBuilders.post("/api/recruitment/apply/save/des")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(newDesign)))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//
//    }
//
//    @Test
//    void ??????_??????() throws Exception {
//        SaveDevelopDto newDevelop = createDevelop();
//
//        mvc.perform(MockMvcRequestBuilders.post("/api/recruitment/apply/save/dev")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(objectMapper.writeValueAsString(newDevelop))
//                .param("save_final", "true"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//    }
//
//    //TODO: add update test
//
//
//}