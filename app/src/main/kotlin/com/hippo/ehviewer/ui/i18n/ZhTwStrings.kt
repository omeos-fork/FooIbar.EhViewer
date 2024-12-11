package com.hippo.ehviewer.ui.i18n

val ZhTwStrings = Strings(
    homepage = "首頁",
    subscription = "訂閱",
    whatsHot = "熱門",
    favourite = "收藏",
    history = "歷史",
    downloads = "下載",
    settings = "設定",
    username = "使用者名稱",
    password = "密碼",
    signIn = "登入",
    register = "註冊",
    signInViaWebview = "透過網頁登入",
    signInFirst = "請先登入",
    textIsEmpty = "文字是空的",
    waring = "警告",
    invalidDownloadLocation = "看來下載路徑似乎沒辦法使用。請至設定重新設定下載路徑。",
    clipboardGalleryUrlSnackMessage = "剪貼簿裡有圖庫連結",
    clipboardGalleryUrlSnackAction = "檢視",
    errorTimeout = "逾時",
    errorUnknownHost = "未知的主機",
    errorRedirection = "重新導向迴圈",
    errorSocket = "網路錯誤",
    errorUnknown = "奇怪的錯誤",
    errorCantFindActivity = "找不到相對應的應用程式",
    errorCannotParseTheUrl = "無法解析連結",
    errorDecodingFailed = "解碼失敗",
    errorReadingFailed = "讀取失敗",
    errorOutOfRange = "超出範圍",
    errorParseError = "解析失敗",
    error509 = "509",
    errorInvalidUrl = "不正確的連結",
    errorGetPtokenError = "取得 pToken 時發生錯誤",
    errorCantSaveImage = "無法儲存圖片",
    errorInvalidNumber = "無效的數字",
    appWaring = "本應用程式中內容來自網際網路，部分內容可能對您的生理及心理造成難以恢復的傷害。本應用程式的作者不會對由其所造成的任何影響負責。\n\n未成年人應在監護人指導下使用本應用程式。\n\n繼續使用即代表您同意上述條款。",
    appWaring2 = "繼續使用即表示您同意上述條款。",
    errorUsernameCannotEmpty = "使用者名稱欄位不能為空",
    errorPasswordCannotEmpty = "密碼欄位不能為空",
    guestMode = "略過登入",
    signInFailed = "登入失敗",
    signInFailedTip = { a -> "若持續出錯，請嘗試“$a”。" },
    getIt = "知道了",
    galleryListSearchBarHintExhentai = "在 ExHentai 搜尋",
    galleryListSearchBarHintEHentai = "在 E-Hentai 搜尋",
    galleryListSearchBarOpenGallery = "開啟圖庫",
    galleryListEmptyHit = "什麼都沒找到",
    galleryListEmptyHitSubscription = "請至 設定->EH->我的標籤 訂閱標籤",
    keywordSearch = "關鍵字搜尋",
    imageSearch = "圖片搜尋",
    searchImage = "圖片搜尋",
    searchSh = "已被移除",
    searchSto = "有種子",
    searchSr = "最低評分",
    searchSpTo = "到",
    searchSpErr1 = "頁數最大值至少為 10",
    searchSpErr2 = "頁數範圍差至少為 20",
    searchSf = "停用排除項：",
    searchSfl = "語言",
    searchSfu = "上傳者",
    searchSft = "標籤",
    selectImage = "選擇圖片",
    selectImageFirst = "請先選擇圖片",
    addToFavourites = "收藏",
    removeFromFavourites = "移除收藏",
    deleteDownloads = "刪除下載",
    quickSearch = "快速搜尋",
    quickSearchTip = "點選“+”以新增快速搜尋",
    addQuickSearchDialogTitle = "新增快速搜尋",
    nameIsEmpty = "名稱是空的",
    delete = "刪除",
    addQuickSearchTip = "圖庫列表的狀態將被儲存為快速搜尋。如果你想儲存搜尋面板的狀態，請先進行搜尋。",
    readme = "ReadMe",
    imageSearchNotQuickSearch = "無法將圖片搜尋加入快速搜尋",
    duplicateQuickSearch = { a -> "已存在相同的快速搜尋，名稱為“$a”。" },
    duplicateName = "名稱重複",
    saveProgress = "儲存進度",
    deleteQuickSearch = { a -> "刪除快速搜尋“$a”？" },
    goToHint = { a, b -> "第 $a 頁，共 $b 頁" },
    any = "不限",
    star2 = "2 星",
    star3 = "3 星",
    star4 = "4 星",
    star5 = "5 星",
    download = "下載",
    read = "閱讀",
    favoredTimes = { a -> "\u2665 $a" },
    ratingText = { a, b, c -> "%s (%.2f, %d)".format(a, b, c) },
    torrentCount = { a -> "種子 ($a)" },
    share = "分享",
    rate = "評分",
    similarGallery = "類似圖庫",
    searchCover = "以封面搜尋",
    noTags = "還沒有標籤",
    noComments = "沒有留言",
    noMoreComments = "已顯示所有的留言了",
    moreComment = "更多留言",
    refresh = "重新整理",
    viewOriginal = "查看原圖",
    openInOtherApp = "在其他應用程式中開啟",
    clearImageCache = "清除圖片快取",
    clearImageCacheConfirm = "為該圖庫清除所有快取圖片？",
    imageCacheCleared = "已清除圖片快取",
    rateSuccessfully = "評分成功",
    rateFailed = "評分失敗",
    noTorrents = "沒有種子",
    torrents = "種子",
    notFavorited = "未收藏",
    addFavoritesDialogTitle = "新增到收藏裡",
    addToFavoriteSuccess = "已新增至收藏中",
    removeFromFavoriteSuccess = "從收藏中移除",
    addToFavoriteFailure = "無法新增至收藏",
    removeFromFavoriteFailure = "無法從收藏中移除",
    filterTheUploader = { a -> "把上傳者“$a”加入過濾列表？" },
    filterTheTag = { a -> "隱藏標籤“$a”？" },
    filterAdded = "已經新增篩選條件",
    newerVersionAvailable = "此圖庫有新版本可以使用。",
    newerVersionTitle = { a, b -> "$a, 於 $b 加入" },
    rating10 = "太神啦！",
    rating9 = "根本把持不住",
    rating8 = "很棒",
    rating7 = "不錯",
    rating6 = "還好",
    rating5 = "普通",
    rating4 = "不行",
    rating3 = "超爛",
    rating2 = "快瞎了",
    rating1 = "快要窒息了",
    rating0 = "下去！",
    galleryInfo = "圖庫資訊",
    copiedToClipboard = "已複製到剪貼簿",
    keyGid = "GID",
    keyToken = "Token",
    keyUrl = "網址",
    keyTitle = "標題",
    keyTitleJpn = "日文標題",
    keyThumb = "縮圖",
    keyCategory = "分類",
    keyUploader = "上傳者",
    keyPosted = "上傳時間",
    keyParent = "上層圖庫",
    keyVisible = "可見",
    keyLanguage = "語言",
    keyPages = "頁數",
    keySize = "大小",
    keyFavoriteCount = "收藏次數",
    keyFavorited = "收藏",
    keyRatingCount = "評分次數",
    keyRating = "分數",
    keyTorrents = "種子數",
    keyTorrentUrl = "種子連結",
    galleryComments = "圖庫留言",
    commentSuccessfully = "留言成功",
    commentFailed = "留言失敗",
    copyCommentText = "複製留言文字",
    blockCommenter = "隱藏評論者",
    filterTheCommenter = { a -> "隱藏評論者“$a”？" },
    editComment = "修改留言",
    editCommentSuccessfully = "留言已被修改",
    editCommentFailed = "修改留言失敗",
    voteUp = "推",
    cancelVoteUp = "收回推",
    voteDown = "噓",
    cancelVoteDown = "收回噓",
    voteUpSuccessfully = "發出推了",
    cancelVoteUpSuccessfully = "已經收回推了",
    voteDownSuccessfully = "發出噓了",
    cancelVoteDownSuccessfully = "已經收回噓了",
    voteFailed = "推噓失敗",
    checkVoteStatus = "檢視推噓狀態",
    clickMoreComments = "點選載入更多留言",
    lastEdited = { a -> "上次修改時間：$a" },
    goTo = "跳到",
    sceneDownloadTitle = { a -> "正在下載 - $a" },
    noDownloadInfo = "下載項目將顯示在此",
    downloadStateNone = "閒置中",
    downloadStateWait = "等待中",
    downloadStateDownloading = "下載中",
    downloadStateDownloaded = "已下載",
    downloadStateFailed = "下載失敗",
    downloadStateFailed2 = { a -> "還有 $a 未完成" },
    downloadStateFinish = "大功告成",
    stat509AlertTitle = "509 警告",
    stat509AlertText = "圖片流量已用盡。請停止下載，休息一下。",
    statDownloadDoneTitle = "下載結束",
    statDownloadDoneTextSucceeded = { a -> "有 $a 項已成功下載" },
    statDownloadDoneTextFailed = { a -> "有 $a 項下載失敗" },
    statDownloadDoneTextMix = { a, b -> "$a 項成功下載，$b 項下載失敗" },
    statDownloadDoneLineSucceeded = { a -> "$a 下載成功" },
    statDownloadDoneLineFailed = { a -> "$a 下載失敗" },
    downloadRemoveDialogTitle = "移除下載佇列",
    downloadRemoveDialogMessage = { a -> "將 $a 從下載佇列中移除嗎？" },
    downloadRemoveDialogMessage2 = { a -> "從下載佇列中移除 $a 項任務嗎？" },
    downloadRemoveDialogCheckText = "刪除圖檔",
    statDownloadActionStopAll = "全部停止",
    defaultDownloadLabelName = "預設",
    downloadMoveDialogTitle = "移動",
    downloadLabels = "下載標籤",
    downloadStartAll = "全部開始",
    downloadStopAll = "全部停止",
    downloadResetReadingProgress = "重置閱讀進度",
    resetReadingProgressMessage = "重置所有已下載圖庫的閱讀進度？",
    downloadServiceLabel = "EhViewer 下載服務",
    downloadSpeedText = { a -> a },
    downloadSpeedText2 = { a, b -> "$a，剩餘 $b" },
    rememberDownloadLabel = "記住下載標籤",
    defaultDownloadLabel = "預設下載標籤",
    addedToDownloadList = "已新增至下載列表",
    selectGroupingMode = "選擇分組依據",
    selectGroupingModeCustom = "自定義標籤",
    selectGroupingModeArtist = "作者",
    unknownArtists = "未知",
    add = "新增",
    newLabelTitle = "新標籤",
    labelTextIsEmpty = "標籤文字是空的",
    labelTextIsInvalid = "“預設”是無效的標籤",
    labelTextExist = "標籤已存在",
    renameLabelTitle = "重新命名標籤",
    deleteLabel = { a -> "刪除標籤“$a”？" },
    noHistory = "歷史紀錄將會顯示在這裡",
    clearAll = "全部清除",
    clearAllHistory = "清除所有歷史紀錄？",
    filter = "隱藏圖庫",
    filterTitle = "標題",
    filterUploader = "上傳者",
    filterTag = "標籤",
    filterTagNamespace = "標籤組",
    filterCommenter = "評論者",
    filterComment = "評論",
    deleteFilter = { a -> "刪除隱藏項“$a”？" },
    addFilter = "新增隱藏項",
    showDefinition = "檢視定義",
    filterText = "隱藏項文字",
    filterTip = "該隱藏系統會在 EHentai 網站隱藏系統的基礎上繼續隱藏圖庫。\n\n標題隱藏項：排除標題含有該關鍵字的圖庫。\n\n上傳者隱藏項：排除該上傳者上傳的圖庫。\n\n標籤隱藏項：排除包含該標籤的圖庫，這會使獲取圖庫列表花費更多時間。\n\n標籤組隱藏項：排除包含該標籤組的圖庫，這會使獲取圖庫列表花費更多時間。",
    uConfig = "EHentai 設定",
    applyTip = "點選右上角的勾勾以儲存設定",
    myTags = "我的標籤",
    shareImage = "分享圖片",
    imageSaved = { a -> "已將圖片儲存至 $a" },
    settingsEh = "EH",
    settingsEhSignOut = "登出",
    settingsEhIdentityCookiesSigned = "身份 Cookie 可用於登入該帳號。<br><b>請注意資料安全</b>",
    settingsEhIdentityCookiesGuest = "訪客模式",
    settingsEhClearIgneous = "清除 igneous",
    settingsUConfig = "EHentai 設定",
    settingsUConfigSummary = "EHentai 網站上的設定",
    settingsMyTags = "我的標籤",
    settingsMyTagsSummary = "EHentai 網站上的我的標籤",
    settingsEhGallerySite = "圖庫站臺",
    settingsEhLaunchPage = "啟動頁",
    settingsEhListMode = "列表模式",
    settingsEhListModeDetail = "詳細資料",
    settingsEhListModeThumb = "縮圖",
    settingsEhDetailSize = "詳細大小",
    settingsEhDetailSizeLong = "長",
    settingsEhDetailSizeShort = "短",
    settingsEhThumbColumns = "縮圖列數",
    settingsEhForceEhThumb = "使用 e-hentai 縮圖伺服器",
    settingsEhForceEhThumbSummary = "若縮圖載入遇到問題可嘗試停用此項",
    settingsEhShowJpnTitle = "顯示日文標題",
    settingsEhShowJpnTitleSummary = "需同時在 EHentai 網站設定中啟用 Japanese Title",
    settingsEhShowGalleryPages = "顯示圖庫頁數",
    settingsEhShowGalleryPagesSummary = "在圖庫列表中顯示頁數",
    settingsEhShowGalleryComments = "顯示圖庫評論",
    settingsEhShowGalleryCommentsSummary = "在圖庫詳情頁中顯示評論",
    settingsEhShowGalleryCommentThreshold = "評論分數閥值",
    settingsEhShowGalleryCommentThresholdSummary = "隱藏小於或等於設定分數的評論（-101 為停用）",
    settingsEhShowTagTranslations = "顯示標籤翻譯",
    settingsEhShowTagTranslationsSummary = "顯示翻譯後的標籤而非原始文字（需花費時間來下載資料檔案）",
    settingsEhTagTranslationsSource = "補充翻譯（由 EhTagTranslation 提供）",
    settingsEhTagTranslationsSourceUrl = "https://github.com/EhTagTranslation/Editor/wiki",
    settingsEhFilter = "隱藏圖庫",
    settingsEhFilterSummary = "根據標題、上傳者、標籤、評論者隱藏圖庫或評論",
    settingsDownload = "下載",
    settingsDownloadDownloadLocation = "下載路徑",
    settingsDownloadCantGetDownloadLocation = "無法取得下載路徑",
    settingsDownloadConcurrency = "並行下載數",
    settingsDownloadConcurrencySummary = { a -> "最多同時下載 $a 張圖片" },
    settingsDownloadPreloadImage = "預載圖片",
    settingsDownloadPreloadImageSummary = { a -> "向後預載 $a 張圖片" },
    settingsDownloadDownloadOriginImage = "下載原圖",
    settingsDownloadDownloadOriginImageSummary = "這很危險！勾選這個選項會導致圖片流量配額快速耗用",
    settingsDownloadSaveAsCbz = "儲存為 CBZ 壓縮檔",
    settingsDownloadArchiveMetadata = "壓縮檔中繼資料",
    settingsDownloadArchiveMetadataSummary = "下載壓縮檔時產生 ComicInfo.xml",
    settingsDownloadReloadMetadata = "重新載入中繼資料",
    settingsDownloadReloadMetadataSummary = "為標籤可能發生變動的下載項更新 ComicInfo.xml",
    settingsDownloadReloadMetadataSuccessfully = { a -> "成功載入 $a 項" },
    settingsDownloadReloadMetadataFailed = { a -> "載入中繼資料失敗: $a" },
    settingsDownloadMediaScan = "允許其他程式進行媒體掃描",
    settingsDownloadMediaScanSummaryOn = "請別讓別人看到你的相簿",
    settingsDownloadMediaScanSummaryOff = "大部分相簿軟體將會忽略顯示下載路徑中的影像",
    settingsDownloadRestoreDownloadItems = "復原下載的檔案",
    settingsDownloadRestoreDownloadItemsSummary = "復原下載路徑中的所有下載的檔案",
    settingsDownloadRestoreNotFound = "未尋獲可復原的已下載檔案",
    settingsDownloadRestoreFailed = "復原失敗",
    settingsDownloadRestoreSuccessfully = { a -> "成功復原 $a 項" },
    settingsDownloadCleanRedundancy = "清除冗餘的檔案",
    settingsDownloadCleanRedundancySummary = "清除已下載但不在下載列表中的圖檔",
    settingsDownloadCleanRedundancyNoRedundancy = "未發現冗餘檔案",
    settingsDownloadCleanRedundancyDone = { a -> "完成冗餘檔案清理，共清理了 $a 個檔案" },
    settingsAdvanced = "進階",
    settingsAdvancedSaveParseErrorBody = "解析失敗時儲存網頁的內容",
    settingsAdvancedSaveParseErrorBodySummary = "網頁內容可能含有敏感的隱私資料",
    settingsAdvancedSaveCrashLog = "應用程式崩潰時儲存錯誤日誌",
    settingsAdvancedSaveCrashLogSummary = "錯誤日誌可以幫助開發者修正問題",
    settingsAdvancedDumpLogcat = "傾印記錄檔",
    settingsAdvancedDumpLogcatSummary = "將紀錄檔儲存至外接儲存裝置",
    settingsAdvancedDumpLogcatFailed = "無法傾印紀錄檔",
    settingsAdvancedDumpLogcatTo = { a -> "已將紀錄檔儲存至 $a" },
    settingsAdvancedReadCacheSize = "閱讀快取大小",
    settingsAdvancedAppLanguageTitle = "應用程式介面語言",
    settingsAdvancedExportData = "匯出檔案",
    settingsAdvancedExportDataSummary = "儲存資料至外接儲存裝置，例如下載列表，快速搜尋列表",
    settingsAdvancedExportDataTo = { a -> "已匯出資料至 $a" },
    settingsAdvancedExportDataFailed = "無法匯出資料",
    settingsAdvancedImportData = "匯入檔案",
    settingsAdvancedImportDataSummary = "從之前儲存的檔案匯入",
    settingsAdvancedImportDataSuccessfully = "成功將資料匯入",
    settingsAdvancedBackupFavorite = "備份收藏列表",
    settingsAdvancedBackupFavoriteSummary = "備份雲端收藏列表到本機",
    settingsAdvancedBackupFavoriteStart = { a -> "正在備份收藏列表 $a" },
    settingsAdvancedBackupFavoriteNothing = "沒有可以備份的收藏列表",
    settingsAdvancedBackupFavoriteSuccess = "備份收藏列表成功",
    settingsAdvancedBackupFavoriteFailed = "備份收藏列表失敗",
    settingsAbout = "關於",
    settingsAboutDeclarationSummary = "EhViewer 與 E-Hentai.org 無任何關聯",
    settingsAboutAuthor = "作者",
    settingsAboutLatestRelease = "最新版本",
    settingsAboutSource = "原始碼",
    settingsAboutVersion = "版本號碼",
    settingsAboutCommitTime = { a -> "於 $a 提交" },
    settingsAboutCheckForUpdates = "檢查更新",
    license = "授權條款",
    pleaseWait = "請稍候",
    cantReadTheFile = "無法讀取檔案",
    appLanguageSystem = "系統語言（預設）",
    cloudFavorites = "雲端收藏",
    localFavorites = "本機收藏",
    searchBarHint = { a -> "搜尋 $a" },
    favoritesTitle = { a -> a },
    favoritesTitle2 = { a, b -> "$a - $b" },
    deleteFavoritesDialogTitle = "移除收藏",
    deleteFavoritesDialogMessage = { a -> "將 $a 項收藏移除？" },
    moveFavoritesDialogTitle = "移動收藏",
    defaultFavoritesCollection = "預設收藏夾",
    defaultFavoritesWarning = "若啟用此項將無法新增收藏備註",
    letMeSelect = "讓我每次都選擇",
    favoriteNote = "收藏備註",
    collections = "收藏夾",
    errorSomethingWrongHappened = "被玩壞了",
    fromTheFuture = "來自未來",
    justNow = "剛剛",
    yesterday = "昨天",
    someDaysAgo = { a -> "$a 天前" },
    archive = "壓縮檔",
    archiveFree = "免費",
    archiveOriginal = "原始",
    archiveResample = "重新採樣",
    noArchives = "沒有壓縮檔",
    downloadArchiveStarted = "開始下載壓縮檔",
    downloadArchiveFailure = "下載失敗",
    downloadArchiveFailureNoHath = "下載壓縮檔需要 H@H 客戶端",
    currentFunds = "目前資金：",
    insufficientFunds = "餘額不足",
    imageLimits = "圖片配額",
    imageLimitsSummary = "已用：",
    resetCost = { a -> "花費 $a GP 重置" },
    reset = "重置",
    settingsPrivacy = "隱私",
    settingsPrivacySecure = "不允許螢幕擷取",
    settingsPrivacySecureSummary = "啟用後，將無法對本程式進行螢幕擷取，同時，將不會在系統任務切換器中顯示該程式的預覽內容，重新啟動本程式以套用此變更",
    clearSearchHistory = "清除裝置上的搜尋記錄",
    clearSearchHistorySummary = "移除曾在此裝置上進行過的搜尋",
    clearSearchHistoryConfirm = "清除搜尋記錄？",
    searchHistoryCleared = "已清除搜尋記錄",
    downloadService = "下載服務",
    keyFavoriteName = "收藏圖庫",
    blackDarkTheme = "純黑深色主題",
    harmonizeCategoryColor = "以動態顏色為分類顏色配色",
    backupBeforeUpdate = "更新前備份資料",
    useCiUpdateChannel = "使用 CI 更新頻道",
    sortBy = "排序方式",
    addedTimeDesc = "加入時間 (遞減)",
    addedTimeAsc = "加入時間 (遞增)",
    uploadedTimeDesc = "上傳時間 (遞減)",
    uploadedTimeAsc = "上傳時間 (遞增)",
    titleAsc = "標題 (遞減)",
    titleDesc = "標題 (遞增)",
    pageCountAsc = "頁數 (遞減)",
    pageCountDesc = "頁數 (遞增)",
    groupByDownloadLabel = "按下載標籤分組",
    downloadFilter = "過濾",
    downloadAll = "全部",
    downloadStartAllReversed = "全部開始（倒序）",
    settingsDownloadDownloadDelay = "下載延時",
    settingsDownloadDownloadDelaySummary = { a -> "每次下載延時 $a 毫秒" },
    settingsDownloadDownloadTimeout = "下載超時（秒）",
    noBrowserInstalled = "請安裝一個瀏覽器。",
    toplistAlltime = "從始至終",
    toplistPastyear = "過去一年",
    toplistPastmonth = "過去一個月",
    toplistYesterday = "昨日",
    toplist = "排行",
    tagVoteDown = "不，這不是",
    tagVoteUp = "是的，這很正確",
    tagVoteSuccessfully = "投票成功",
    deleteSearchHistory = { a -> "從搜尋記錄中刪除“$a”？" },
    actionAddTag = "增加標籤",
    actionAddTagTip = "增加新標籤",
    commentUserUploader = { a -> "$a （上傳者）" },
    settingsEhMeteredNetworkWarning = "流量計費網路警告",
    meteredNetworkWarning = "正在使用流量計費網路",
    readFrom = { a -> "從第 $a 頁閱讀" },
    settingsEhRequestNews = "啟動時請求新聞頁面",
    settingsEhHideHvEvents = "隱藏 HV 事件通知",
    copyTrans = "複製翻譯",
    resetDownloadLocation = "恢復預設路徑",
    pickNewDownloadLocation = "選擇新路徑",
    dontShowAgain = "不再顯示",
    openSettings = "開啟設定",
    appLinkNotVerifiedMessage = "對於 Android 12 及更新的版本，您需要手動增加連結到已驗證連結才能在 EhViewer 中開啟 E-Hentai 連結。",
    appLinkNotVerifiedTitle = "應用程式連結未驗證",
    openByDefault = "預設開啟",
    settingsPrivacyRequireUnlock = "需要解鎖",
    settingsPrivacyRequireUnlockDelay = "鎖定延遲",
    settingsPrivacyRequireUnlockDelaySummary = { a -> "離開程式並在 $a 分鐘內返回時不需要解鎖" },
    settingsPrivacyRequireUnlockDelaySummaryImmediately = "無論何時回到程式均要求解鎖",
    filterLabel = "隱藏項類型",
    archivePasswd = "壓縮檔密碼",
    archiveNeedPasswd = "壓縮檔需要密碼",
    passwdWrong = "密碼錯誤",
    passwdCannotBeEmpty = "密碼不能為空",
    listTileThumbSize = "詳情模式下縮圖大小",
    accountName = "帳號",
    preloadThumbAggressively = "積極地預載入縮圖",
    animateItems = "列表項目動畫",
    animateItemsSummary = "如遇崩潰/低幀率請嘗試停用此項",
    autoUpdates = "自動檢查更新",
    updateFrequencyNever = "從不",
    updateFrequencyDaily = "每天",
    updateFrequency3days = "每 3 天",
    updateFrequencyWeekly = "每週",
    updateFrequencyBiweekly = "每兩週",
    updateFrequencyMonthly = "每月",
    updateFailed = { a -> "更新失敗：$a" },
    newVersionAvailable = "有新版本可用！",
    alreadyLatestVersion = "已是最新版本",
    permissionDenied = "沒有權限",
    downloadGalleryFirst = "請先下載圖庫！",
    exportAsArchive = "匯出成壓縮檔",
    exportAsArchiveSuccess = "匯出成功",
    exportAsArchiveFailed = "匯出失敗",
    actionSettings = "設定",
    actionRetry = "重試",
    actionShare = "分享",
    actionCopy = "複製",
    actionSave = "儲存",
    actionSaveTo = "儲存到…",
    prefCategoryGeneral = "一般",
    prefFullscreen = "全螢幕",
    prefPageTransitions = "翻頁轉場動畫",
    prefShowPageNumber = "顯示頁碼",
    prefShowReaderSeekbar = "顯示跳頁拖動條",
    prefDoubleTapToZoom = "雙擊縮放",
    prefCustomBrightness = "自訂亮度",
    prefCustomColorFilter = "色彩濾鏡",
    prefKeepScreenOn = "保持螢幕恆亮",
    prefReaderTheme = "背景顏色",
    whiteBackground = "白色",
    blackBackground = "黑色",
    leftToRightViewer = "由左至右",
    rightToLeftViewer = "由右至左",
    verticalViewer = "由上至下",
    webtoonViewer = "Webtoon 模式",
    pagerViewer = "單頁式",
    prefImageScaleType = "縮放模式",
    scaleTypeFitScreen = "符合螢幕",
    scaleTypeStretch = "延展",
    scaleTypeFitWidth = "符合頁寬",
    scaleTypeFitHeight = "符合頁高",
    scaleTypeOriginalSize = "原始大小",
    scaleTypeSmartFit = "智慧型填充",
    prefZoomStart = "縮放原點",
    zoomStartAutomatic = "自動",
    zoomStartLeft = "左邊",
    zoomStartRight = "右邊",
    zoomStartCenter = "中間",
    prefRotationType = "預設螢幕方向",
    rotationFree = "自動",
    rotationForcePortrait = "鎖定直向",
    rotationForceLandscape = "鎖定橫向",
    customFilter = "濾鏡",
    decodeImageError = "無法載入該圖片",
    prefReadWithLongTap = "長按顯示",
    prefColorFilterMode = "濾鏡融合機制",
    filterModeMultiply = "色彩增值",
    filterModeScreen = "濾色",
    filterModeOverlay = "覆蓋",
    filterModeLighten = "減淡/變亮",
    filterModeDarken = "加深/變暗",
    prefCutoutShort = "使用螢幕凹口區域",
    actionMenu = "選單",
    webtoonSidePadding25 = "25%",
    webtoonSidePadding20 = "20%",
    webtoonSidePadding15 = "15%",
    webtoonSidePadding10 = "10%",
    webtoonSidePadding0 = "無",
    prefWebtoonSidePadding = "頁緣留白",
    verticalPlusViewer = "垂直連貫",
    grayBackground = "灰色",
    viewer = "閱讀模式",
    tappingInvertedBoth = "水平 + 垂直",
    tappingInvertedVertical = "垂直",
    tappingInvertedHorizontal = "水平",
    tappingInvertedNone = "無",
    prefCategoryReadingMode = "閱讀模式",
    prefReadWithTappingInverted = "反轉輕觸區域",
    prefViewerNav = "輕觸區域",
    edgeNav = "邊緣式",
    kindlishNav = "Kindle 式",
    lNav = "L 式",
    rightAndLeftNav = "左右式",
    navZoneRight = "右邊",
    navZoneLeft = "左邊",
    navZoneNext = "下一頁",
    navZonePrev = "上一頁",
    rotationLandscape = "橫向",
    rotationPortrait = "直向",
    rotationType = "螢幕方向",
    prefGrayscale = "灰階",
    automaticBackground = "自動",
    prefInvertedColors = "反轉",
    labelDefault = "預設",
    webtoonSidePadding5 = "5%",
    prefLandscapeZoom = "縮放橫向圖片",
    prefNavigatePan = "輕觸時移動圖片",
    rotationReversePortrait = "顛倒直向",
    disabledNav = "停用",
    wideColorGamut = "使用 Display P3 色彩空間",
    settingsEhRequestNewsTimepicker = "設定請求新聞頁面的時間",
    darkTheme = "深色主題",
    darkThemeFollowSystem = "跟隨系統",
    darkThemeOff = "總是關閉",
    darkThemeOn = "總是開啟",
    prefCropBorders = "邊緣裁剪",
    pageCount = { a -> "$a 頁" },
    someMinutesAgo = { a -> "$a 分鐘前" },
    someHoursAgo = { a -> "$a 小時前" },
    second = { "秒" },
    minute = { "分鐘" },
    hour = { "小時" },
    day = { "天" },
    year = { "年" },
)
